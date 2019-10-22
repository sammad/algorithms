package com.ms.desinpatterns.observer;

public class Main {

	public static void main(String[] args) {
		
		MetricsAggregator metricsMeanAggregator = new SystemMetricsMeanAggregator();
		MetricsAggregator metricsMedianAggregator = new SystemMetricsMedianAggregator();
		MetricsAnalyser metricsAnalyser = new SystemMetricsAnalyser();
		metricsAnalyser.registerMetricsAggregator(metricsMeanAggregator,metricsMedianAggregator);
		for(int index=0;index<10;index++){
			Metrics metrics = getSystemMetrics();
			metricsAnalyser.notifyMetricsAggregators(metrics);
			System.err.println();
		}
		metricsAnalyser.deregisterMetricsAggregator(metricsMedianAggregator,metricsMeanAggregator);
		
	}

	private static Metrics getSystemMetrics() {
		
		return new SystemMetrics();
	}

}
