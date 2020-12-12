package cn.edu.xmu.ooad.other.required.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class OrderItemSimple implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6965060482691403162L;
	//id
	Long orderItemId;
	Long skuId;
	Integer quantity;
	Long shopId;
	//返回实际支付的单价
	Integer finalPrice;
	
	OrderItemSimple(){}
	/**
	 * 构造函数
	 * @param id ：orderitemid
	 * @param skuId
	 * @param quantity
	 * @param shopId
	 * @param finalPrice ：实际支付时的单价
	 */
	OrderItemSimple(Long id,Long skuId, Integer quantity, Long shopId, Integer finalPrice){
		setOrderItemId(id);
		setSkuId(skuId);
		setShopId(shopId);
		setFinalPrice(finalPrice);
		setQuantity(quantity);
	}
}
