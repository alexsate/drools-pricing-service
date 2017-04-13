package br.com.drools.pricing.model;

import java.math.BigDecimal;

public class FlightG3 {

	private String origin;
	private String destination;
	private String cabine;
	private String productClass;
	private String skpCluster;
	private String haul;
	private String advp;
	private BigDecimal valorTarifa;
	private Integer precoMilhas;
	private String conversaoMilhas;
	private String tracking;

	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @param origin
	 *            the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination
	 *            the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the cabine
	 */
	public String getCabine() {
		return cabine;
	}

	/**
	 * @param cabine
	 *            the cabine to set
	 */
	public void setCabine(String cabine) {
		this.cabine = cabine;
	}

	/**
	 * @return the productClass
	 */
	public String getProductClass() {
		return productClass;
	}

	/**
	 * @param productClass
	 *            the productClass to set
	 */
	public void setProductClass(String productClass) {
		this.productClass = productClass;
	}

	/**
	 * @return the skpCluster
	 */
	public String getSkpCluster() {
		return skpCluster;
	}

	/**
	 * @param skpCluster
	 *            the skpCluster to set
	 */
	public void setSkpCluster(String skpCluster) {
		this.skpCluster = skpCluster;
	}

	/**
	 * @return the haul
	 */
	public String getHaul() {
		return haul;
	}

	/**
	 * @param haul
	 *            the haul to set
	 */
	public void setHaul(String haul) {
		this.haul = haul;
	}

	/**
	 * @return the advp
	 */
	public String getAdvp() {
		return advp;
	}

	/**
	 * @param advp
	 *            the advp to set
	 */
	public void setAdvp(String advp) {
		this.advp = advp;
	}

	public BigDecimal getValorTarifa() {
		return valorTarifa;
	}
	
	public void setValorTarifa(BigDecimal valorTarifa) {
		this.valorTarifa = valorTarifa;
	}
	

	/**
	 * @return the precoMilhas
	 */
	public Integer getPrecoMilhas() {
		return precoMilhas;
	}

	/**
	 * @param precoMilhas
	 *            the precoMilhas to set
	 */
	public void setPrecoMilhas(Integer precoMilhas) {
		this.precoMilhas = precoMilhas;
	}

	/**
	 * @return the conversaoMilhas
	 */
	public String getConversaoMilhas() {
		return conversaoMilhas;
	}

	/**
	 * @param conversaoMilhas
	 *            the conversaoMilhas to set
	 */
	public void setConversaoMilhas(String conversaoMilhas) {
		this.conversaoMilhas = conversaoMilhas;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FlightG3 [origin=" + origin + ", destination=" + destination + ", cabine=" + cabine + ", productClass="
				+ productClass + ", skpCluster=" + skpCluster + ", haul=" + haul + ", advp=" + advp + ", valorTarifa="
				+ valorTarifa + ", precoMilhas=" + precoMilhas + ", conversaoMilhas=" + conversaoMilhas + "]";
	}

	/**
	 * @return the tracking
	 */
	public String getTracking() {
		return tracking;
	}

	/**
	 * @param tracking the tracking to set
	 */
	public void setTracking(String tracking) {
		this.tracking = tracking;
	}

}
