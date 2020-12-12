package cn.edu.xmu.ooad.other.required.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class OrderSimple {
	List<OrderItemSimple> orderItems;
	Long orderId;
	String orderSn;
	Long shopId;
	
	/** 默认构造函数 不做任何操作
	 * 
	 */
	public OrderSimple() {}
	/**通过orderItemId获取全部orderItems和订单相关信息，
	 * 即orderItemId->orderItem->orderId->order。
	 * 
	 * @param orderItems
	 * @param orderId
	 * @param orderSn
	 * @param shopId
	 */
	public OrderSimple(List<OrderItemSimple> orderItems, Long orderId,String orderSn,Long shopId) {
		setOrderItems(orderItems);
		setOrderId(orderId);
		setOrderSn(orderSn);
		setShopId(shopId);
	}
	/**通过orderItemId获取对应的orderItems和订单相关信息，
	 * 即只需要一个orderItem
	 * 
	 * @param orderItem
	 * @param orderId
	 * @param orderSn
	 * @param shopId
	 */
	public OrderSimple(OrderItemSimple orderItem, Long orderId,String orderSn,Long shopId) {
		this.orderItems = new ArrayList<OrderItemSimple>();
		this.orderItems.add(orderItem);
		setOrderId(orderId);
		setOrderSn(orderSn);
		setShopId(shopId);
	}
}
