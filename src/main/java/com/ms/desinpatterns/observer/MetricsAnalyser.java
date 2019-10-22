package com.ms.desinpatterns.observer;

public interface MetricsAnalyser {

	public void registerMetricsAggregator(MetricsAggregator... metricsAggregator);
	public void deregisterMetricsAggregator(MetricsAggregator... metricsAggregator);
	public void notifyMetricsAggregators(Metrics metrics);
}
