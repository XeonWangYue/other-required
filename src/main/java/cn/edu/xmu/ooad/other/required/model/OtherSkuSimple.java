package cn.edu.xmu.ooad.other.required.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class OtherSkuSimple implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6050705991352804495L;
	Long id;
	String skuSn;
	String name;
	String imageUrl;
	Long inventory;
	Long originalPrice;
	Long pirce;
	Boolean disable;
	
	public OtherSkuSimple() {};
	public OtherSkuSimple(Long id,Long SkuSn,String skuName,String url,Long originalPrice,Long price,Boolean diable) {
		setSkuSn(skuSn);
		setId(id);
		setName(skuName);
		setImageUrl(url);
		setInventory(inventory);
		setOriginalPrice(originalPrice);
		setPirce(price);
		setDisable(diable);
	}
}
