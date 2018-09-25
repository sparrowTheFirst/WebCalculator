package pl.demo.service;

import org.springframework.stereotype.Service;

@Service
public class BasicMethodServiceImpl implements BasicMethodService {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int substruct(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public String divide(int a, int b) {
        return String.valueOf(b == 0 ? "Pamiętaj cholero - Nie dziel przez ZERO!" : String.format("%.2f", ((double)a / b)));
    }
}
