package com.ms.desinpatterns.observer;

import java.util.UUID;

public class SystemMetricsMedianAggregator implements MetricsAggregator {

	@Override
	public void notifyMetricChange(Metrics metrics) {
		System.out.println("Median CPU %="+((SystemMetrics)metrics).getCpuUsedPct());
	}
	@Override
	public String getAggregatorId() {
		return "SystemMetricsMedianAggregator-"+UUID.randomUUID();
	}
}
