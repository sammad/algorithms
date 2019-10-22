package com.ms.desinpatterns.observer;

import java.util.List;

public interface MetricsAgent {

	public void notifyMetrics(List<Metrics> metrics);
}
