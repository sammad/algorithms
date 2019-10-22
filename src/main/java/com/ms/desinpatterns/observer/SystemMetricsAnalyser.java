package com.ms.desinpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class SystemMetricsAnalyser implements MetricsAnalyser {
	private List<MetricsAggregator> metricsAggregators = new ArrayList<>();
	@Override
	public void registerMetricsAggregator(MetricsAggregator... metricsAggregatorArr) {
		for(MetricsAggregator metricsAggregator:metricsAggregatorArr){
			metricsAggregators.add(metricsAggregator);
			System.out.println("Registered Aggregator="+metricsAggregator.getAggregatorId());
		}
	}

	@Override
	public void deregisterMetricsAggregator(MetricsAggregator... metricsAggregatorArr) {
		for(MetricsAggregator metricsAggregator:metricsAggregatorArr){
			metricsAggregators.remove(metricsAggregator);
			System.out.println("UnRegistered Aggregator="+metricsAggregator.getAggregatorId());
		}
	}

	@Override
	public void notifyMetricsAggregators(Metrics metrics) {
		for(MetricsAggregator metricsAggregator:metricsAggregators){
			metricsAggregator.notifyMetricChange(metrics);
		}

	}

}
