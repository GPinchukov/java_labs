package by.gsu.pms.Builder;

import by.gsu.pms.tariff.TariffBonus;


public interface Builder {

    public TariffBonus getTariffBonus(int costSubscriptionFee, int costMinuteInNet, int costMinuteInOtherNet, int costSms, int costMegabyte, int packageInternet, int packageMinute);
}
