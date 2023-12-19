package com.covid;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Answer {
    public static void main( String[] args ){
        List<Covid19Case> covid19case = Covid19Statistics.covid19Cases();
        
    	System.out.println("1. 加總每個縣市的新冠病毒案例" + answerOne(covid19case));
    	System.out.println("2. 根據月份跟縣市加總" + answerTwo(covid19case));
    	System.out.println("3. 取台北在六月份的新冠病毒案例" + answerThree(covid19case));
    }
    
    private static Map<String, Integer>  answerOne(List<Covid19Case> covid19case) {
        //1. 加總每個縣市的新冠病毒案例
    	Map<String, Integer> countyCase = new HashMap<>();
    	
        for( Covid19Case covidCase: covid19case) {
            int currentDateCases = covidCase.getNumberOfCases();
            String county = covidCase.getCounty();
            int accCaseCount = accCaseCount(currentDateCases, countyCase, county);
            
    		countyCase.put(county, accCaseCount);
    	}
        return countyCase;
    }
    
    
    private static Map<Integer, Map<String, Integer>>  answerTwo(List<Covid19Case> covid19case) {
    	// 2. 根據月份跟縣市加總 (1月：ＸＸ市)
    	Map<Integer, Map<String, Integer> > caseOfMonth = new HashMap<>();
    	
    	for(Covid19Case covidCase: covid19case) {
    		int month = covidCase.getDate().getMonthValue();
    		String county = covidCase.getCounty();
    		int currentDateCases = covidCase.getNumberOfCases();
    		
    		Map<String, Integer> countyCase = caseOfMonth.get(month);
    		
    		if(Objects.isNull(countyCase)) {
    			countyCase = new HashMap<>();
    			countyCase.put(county, 0);
    			caseOfMonth.put(month, countyCase);
    		}
    		
    		int accCaseCount = accCaseCount(currentDateCases, countyCase, county);
    		
            countyCase.put(county, accCaseCount);
    	    caseOfMonth.put(month, countyCase);	 
    	}

    	return caseOfMonth;
    }
    
    private static int accCaseCount(int currentDateCases, Map<String, Integer> countyCase, String county) {
		int accCaseCount = currentDateCases;
		if(countyCase.keySet().contains(county)) { 
			accCaseCount += countyCase.get(county);
		}
		return accCaseCount;
    }
     
    private static int answerThree(List<Covid19Case> covid19case) {
    	//3. 取台北在六月份的新冠病毒案例
    	int accCaseCount = 0;
    	
    	for(Covid19Case covidCase : covid19case) {
    		String county = covidCase.getCounty();
    		int month = covidCase.getDate().getMonthValue();
    		int caseCount = covidCase.getNumberOfCases();
    		
    		if(county.equals("Taipei") && month == 6) {
    			accCaseCount += caseCount;
    		}
    	}
    	return accCaseCount;
    }
    
}
