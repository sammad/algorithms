package com.ms.desinpatterns.observer;

public interface MetricsAggregator {

	public void notifyMetricChange(Metrics metrics);
	public String getAggregatorId();
	
}
