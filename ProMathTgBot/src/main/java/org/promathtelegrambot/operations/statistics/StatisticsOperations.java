package org.promathtelegrambot.operations.statistics;

import java.util.List;

interface Statistics{
    double mean(List<Double> values);
    double MAE(List<Double> values);
    double MSE(List<Double> values);
    double rootMSE(List<Double> values);
    double predict(List<Double> values);
    double pValue(List<Double> values);
    double tStatistic(List<Double> values);
    double excess(List<Double> values);
    double dispersion(List<Double> values);
    double mathE(List<Double> values);
    double KolmogorovSmirnov(List<Double> values);
}

public class StatisticsOperations implements Statistics {
    @Override
    public double mean(List<Double> values) {
        double x = 0;
        for(int i = 0; i < values.size(); i++){
            x += values.get(i);
        }
        x /= values.size();
        return x;
    }

    @Override
    public double MAE(List<Double> values){
        return 0;
    }

    @Override
    public double MSE(List<Double> values){
        return 0;
    }

    @Override
    public double rootMSE(List<Double> values){
        return 0;
    }

    @Override
    public double predict(List<Double> values){
        return 0;
    }

    @Override
    public double pValue(List<Double> values){
        return 0;
    }

    @Override
    public double tStatistic(List<Double> values){
        return 0;
    }

    @Override
    public double excess(List<Double> values){
        return 0;
    }

    @Override
    public double dispersion(List<Double> values){
        return 0;
    }

    @Override
    public double mathE(List<Double> values){
        return 0;
    }

    @Override
    public double KolmogorovSmirnov(List<Double> values){
        return 0;
    }
}
