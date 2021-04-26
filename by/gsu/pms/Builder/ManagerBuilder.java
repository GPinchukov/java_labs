package by.gsu.pms.Builder;

import by.gsu.pms.tariff.Species;
import by.gsu.pms.tariff.TariffBonus;


public class ManagerBuilder {
    public static TariffBonus getTariffBonus(int costSubscriptionFee, int costMinuteInNet, int costMinuteInOtherNet, int costSms, int costMegabyte, Species species, int packageInternet, int packageMinute) {
        TariffBonus tariffBonus = null;
        switch (species) {
            case ABSOLUTE:
                Absolute  builderAbsolute = new Absolute();
                tariffBonus = builderAbsolute.getTariffBonus(costSubscriptionFee,costMinuteInNet,costMinuteInOtherNet,costSms,costMegabyte,packageInternet,packageMinute);
                break;
            case SMART:
                Smart builderSmart = new Smart();
                tariffBonus = builderSmart.getTariffBonus(costSubscriptionFee,costMinuteInNet,costMinuteInOtherNet,costSms,costMegabyte,packageInternet,packageMinute);
                break;
            case SMARTLITE:
                SmartLite builderSmartLite = new SmartLite();
                tariffBonus = builderSmartLite.getTariffBonus(costSubscriptionFee,costMinuteInNet,costMinuteInOtherNet,costSms,costMegabyte,packageInternet,packageMinute);
                break;
            case SMARTMINI:
                SmartMini builderSmartMini = new SmartMini();
                tariffBonus = builderSmartMini.getTariffBonus(costSubscriptionFee,costMinuteInNet,costMinuteInOtherNet,costSms,costMegabyte,packageInternet,packageMinute);
                break;
        }
        return tariffBonus;
    }
}
