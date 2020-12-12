package cn.edu.xmu.ooad.other.required.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class SkuSimple implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6050705991352804495L;
	Long skuId;
	Long spuId;
	String skuName;
	Integer originalPirce;
	public SkuSimple() {};
	public SkuSimple(Long id,Long spuId,String skuName,Integer originalPrice) {
		setSkuId(skuId);
		setSpuId(spuId);
		setSkuName(skuName);
		setOriginalPirce(originalPrice);
	}
}
