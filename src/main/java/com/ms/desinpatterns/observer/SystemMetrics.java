package com.ms.desinpatterns.observer;

public class SystemMetrics implements Metrics {

	private Double cpuUsedPct;
	private Double memoryUsedInMB;
	private Double memoryAvailableInMB;
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
