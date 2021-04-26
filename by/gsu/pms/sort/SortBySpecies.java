package by.gsu.pms.sort;

import by.gsu.pms.tariff.Tariff;
import by.gsu.pms.tariff.TariffBonus;

import java.util.Comparator;


public class SortBySpecies implements Comparator<Tariff> {
        @Override
        public int compare(Tariff o1, Tariff o2) {
            TariffBonus tariffBonus1 = null;
            TariffBonus tariffBonus2 = null;
            if (o2 instanceof TariffBonus) {
                tariffBonus2 = (TariffBonus) o2;
            }
            if (o1 instanceof TariffBonus) {
                tariffBonus1 = (TariffBonus) o1;
            }
            return tariffBonus1.getSpecies().compareTo(tariffBonus2.getSpecies());
        }

    }

