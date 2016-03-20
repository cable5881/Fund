package com.fund.utils;

import java.text.DecimalFormat;

public class NumberUtil {
	public static String MoneyConvert(Double money) {
		if(money == null)
			return 0+"";
		DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getInstance();
		decimalFormat.setMaximumFractionDigits(2);
		decimalFormat.setGroupingUsed(false);
		return decimalFormat.format(money);
	}
}
