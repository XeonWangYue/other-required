package cn.edu.xmu.ooad.other.required.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OtherOrderItemComplex implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6921657369555237544L;
	//id
	Long orderItemId;
	Long skuId;
	Integer quantity;
	//订单总支付价格
	Long orderPrice;
	//实际支付总金额
	Long payPrice;
	
	String skuName;
	//order 部分
	String orderSn;
	Long shopId;
	
}
