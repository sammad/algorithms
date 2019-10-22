package com.ms.desinpatterns.observer;

import java.util.concurrent.ThreadLocalRandom;

public class SystemMetrics implements Metrics {

	private Double cpuUsedPct;
	private Double memoryUsedInMB;
	private Double memoryAvailableInMB;
	public SystemMetrics(){
		cpuUsedPct = ThreadLocalRandom.current().nextDouble(1.0d, 100.0d);
		memoryUsedInMB=ThreadLocalRandom.current().nextDouble(10.0d, 500.0d);
		memoryAvailableInMB=ThreadLocalRandom.current().nextDouble(10.0d, 1024.0d);
	}
	
	public SystemMetrics(Double cpuUsedPct, Double memoryUsedInMB, Double memoryAvailableInMB) {
		this.cpuUsedPct = cpuUsedPct;
		this.memoryUsedInMB = memoryUsedInMB;
		this.memoryAvailableInMB = memoryAvailableInMB;
	}

	public Double getCpuUsedPct() {
		return cpuUsedPct;
	}
	public void setCpuUsedPct(Double cpuUsedPct) {
		this.cpuUsedPct = cpuUsedPct;
	}
	public Double getMemoryUsedInMB() {
		return memoryUsedInMB;
	}
	public void setMemoryUsedInMB(Double memoryUsedInMB) {
		this.memoryUsedInMB = memoryUsedInMB;
	}
	public Double getMemoryAvailableInMB() {
		return memoryAvailableInMB;
	}
	public void setMemoryAvailableInMB(Double memoryAvailableInMB) {
		this.memoryAvailableInMB = memoryAvailableInMB;
	}
	
}
