package com.covid;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/*
1. 加總每個縣市的新冠病毒案例
2. 根據月份跟縣市加總
3. 取台北在六月份的新冠病毒案例
 * 
 */
public class Answer {
    public static void main( String[] args ){
        List<Covid19Case> covid19case = Covid19Statistics.covid19Cases();

    	System.out.println("1. 加總每個縣市的新冠病毒案例" + answerOne(covid19case));
    	
    	System.out.println("2. 根據月份跟縣市加總" + answerTwo(covid19case));

    	System.out.println("3. 取台北在六月份的新冠病毒案例" + answerThree(covid19case));

    	
    	//2. 根據月份跟縣市加總
    }
    
    private static Map<String, Integer>  answerOne(List<Covid19Case> covid19case) {
        //1. 加總每個縣市的新冠病毒案例
    	Map<String, Integer> caseCount = new HashMap<>();
    	
        for( Covid19Case covidCase: covid19case) {
    	    String county = covidCase.getCounty();
            int currentDateCases = covidCase.getNumberOfCases();
          
    		if(caseCount.keySet().contains(county)) { 
    			currentDateCases += caseCount.get(county);
    		}
    		caseCount.put(county, currentDateCases);
    	}
        return caseCount;
    }
    
    
    private static Map<Integer, Map<String, Integer>>  answerTwo(List<Covid19Case> covid19case) {
    	// 2. 根據月份跟縣市加總 (1月：ＸＸ市)
    	Map<Integer, Map<String, Integer> > caseOfMonth = new HashMap<>();
    	
    	for(Covid19Case covidCase: covid19case) {
    		System.out.println()
    		int month = covidCase.getDate().getMonthValue();
    		String county = covidCase.getCounty();
    		int currentDateCases = covidCase.getNumberOfCases();
    		
    		Map<String, Integer> caseCount = new HashMap<>();
    		if(caseOfMonth.keySet().contains(month)) {
    			if(caseCount.keySet().contains(county)) { 
    				currentDateCases += caseCount.get(county);
    			}
    			caseCount.put(county, currentDateCases);
    		}else {
    			if(caseCount.keySet().contains(county)) { 
    				currentDateCases += caseCount.get(county);
    			}
    			caseCount.put(county, currentDateCases);
    			caseOfMonth.put(month, caseCount);
    		}
    	
    	
    	
    	
    	}
 
    	
    	
    	
    	
    	return caseOfMonth;
    }
    
    private static int answerThree(List<Covid19Case> covid19case) {
    	//3. 取台北在六月份的新冠病毒案例
    	int totalCases = 0;
    	
    	for(Covid19Case covidCase : covid19case) {
    		String county = covidCase.getCounty();
    		int month = covidCase.getDate().getMonthValue();
    		int caseCount = covidCase.getNumberOfCases();
    		
    		if(county.equals("Taipei") && month == 6) {
    			totalCases += caseCount;
    		}
    	}
    	
    	return totalCases;
    }
    
    
}
