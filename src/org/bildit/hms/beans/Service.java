package org.bildit.hms.beans;

/**
 * @author Novislav Sekulic
 *
 */
public class Service {
	// data field
	private int serviceId;
	private String serviceName;
	private double serviceCost;

	/**
	 * no-arg constructor
	 */
	public Service() {

	}

	/**
	 * Construct object with secified value.
	 * 
	 * @param serviceId
	 *            id of service, int value
	 * @param serviceName
	 *            name of service, String value
	 * @param serviceCost
	 *            cost per service, double value
	 */
	public Service(int serviceId, String serviceName, double serviceCost) {
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.serviceCost = serviceCost;
	}

	/* getters and setters */
	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public double getServiceCost() {
		return serviceCost;
	}

	public void setServiceCost(double serviceCost) {
		this.serviceCost = serviceCost;
	}

	@Override
	public String toString() {
		return "Servide ID: " + serviceId + 
				"\nService Name: " + serviceName
				+ "\nService cost: " + serviceCost;
	}
}