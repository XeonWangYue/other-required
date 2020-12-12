package cn.edu.xmu.ooad.other.required;

import cn.edu.xmu.ooad.other.required.model.OrderItemSimple;

public interface IOrderItemService {
	/**根据orderItemId获取orderItem相关信息，若资源不存在返回空
	 * @author chenqw
	 * @param orderItemId
	 * @return OrderItemSimple or null
	 */
	public OrderItemSimple getOrderItemByOrderItemId(Long orderItemId);
}
