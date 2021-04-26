package by.gsu.pms.Builder;

import by.gsu.pms.tariff.Species;
import by.gsu.pms.tariff.TariffBonus;


public class Smart implements Builder {

    public TariffBonus getTariffBonus(int costSubscriptionFee, int costMinuteInNet, int costMinuteInOtherNet, int costSms, int costMegabyte, int packageInternet, int packageMinute ) {
        TariffBonus tariffBonus = new TariffBonus(costSubscriptionFee,costMinuteInNet,costMinuteInOtherNet,costSms,costMegabyte,Species.SMART,packageInternet,packageMinute);
        return tariffBonus;
    }

}