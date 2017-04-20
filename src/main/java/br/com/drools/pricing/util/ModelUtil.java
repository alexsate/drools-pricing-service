package br.com.drools.pricing.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ModelUtil {
	
	public static Integer round(Double value, String typeRoundingString, Integer scaleRounding, Integer milesValue){
		if (value != null){
			TypeRounding typeRounding = TypeRounding.valueOf(typeRoundingString.toUpperCase());
			Integer valueRounding = 0;
			switch (typeRounding) {
				case PARACIMA:
					valueRounding = new BigDecimal(value/scaleRounding).setScale(0, RoundingMode.UP).intValue();
					break;
				case PARABAIXO:
					valueRounding = new BigDecimal(value/scaleRounding).setScale(0, RoundingMode.DOWN).intValue();
					break;
				case PROXIMO:
					valueRounding = new BigDecimal(value/scaleRounding).setScale(0, RoundingMode.HALF_UP).intValue();
					break;
			}

			return valueRounding * scaleRounding;
		}
		
		return milesValue;
	}
}
