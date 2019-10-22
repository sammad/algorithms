package com.ms.desinpatterns.observer;

public interface MetricsAggregator {

	public boolean registerMetricAgent();
	public boolean dergisterMetricAgent();
	public void notifyMetricChange();
	
}
