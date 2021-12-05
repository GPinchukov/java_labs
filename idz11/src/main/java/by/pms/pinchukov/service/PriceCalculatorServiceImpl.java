package by.akarumey.project.service;

import by.akarumey.project.bean.Order;
import org.springframework.stereotype.Service;

@Service
public class PriceCalculatorServiceImpl implements PriceCalculatorService {

    @Override
    public int calculate(final Order order) {
        return order.getTour().getPrice() + (order.getHotel().getPrice() * order.getNights());
    }

}
