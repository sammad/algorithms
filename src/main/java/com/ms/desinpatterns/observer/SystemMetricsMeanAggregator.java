package com.ms.desinpatterns.observer;

import java.util.UUID;

public class SystemMetricsMeanAggregator implements MetricsAggregator {
	private static int count=1;
	private static SystemMetrics sumSystemMetrics = new SystemMetrics(0.0d,0.0d,0.0d);
	@Override
	public void notifyMetricChange(Metrics metrics) {
		SystemMetrics systemMetricsArgs = (SystemMetrics)metrics;
		sumSystemMetrics.setCpuUsedPct(sumSystemMetrics.getCpuUsedPct()+systemMetricsArgs.getCpuUsedPct());
		System.out.println("Mean CPU%="+sumSystemMetrics.getCpuUsedPct()/count);
		count+=1;
	}
	@Override
	public String getAggregatorId() {
		return "SystemMetricsMeanAggregator-"+UUID.randomUUID();
	}

}
