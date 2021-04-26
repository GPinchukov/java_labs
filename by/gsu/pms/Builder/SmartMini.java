package by.gsu.pms.Builder;

import by.gsu.pms.tariff.Species;
import by.gsu.pms.tariff.TariffBonus;


public class SmartMini implements Builder {

    @Override
    public TariffBonus getTariffBonus(int costSubscriptionFee, int costMinuteInNet, int costMinuteInOtherNet, int costSms, int costMegabyte, int paskageInternet, int paskageMinute) {
        TariffBonus tariffBonus = new TariffBonus(costSubscriptionFee,costMinuteInNet,costMinuteInOtherNet,costSms,costMegabyte,Species.SMARTMINI,paskageInternet,paskageMinute);
        return tariffBonus;
    }

}
