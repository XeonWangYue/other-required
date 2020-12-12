package cn.edu.xmu.ooad.other.required;

import cn.edu.xmu.ooad.other.required.model.OrderSimple;

public interface IOrderService {
	/**根据orderItemId获取orderItem相关信息和order信息，若资源不存在返回空
	 * @author chenqw
	 * @param orderItemId
	 * @return OrderItemSimple or null
	 */
	public OrderSimple getOrderItemByOrderItemId(Long orderItemId);
	/**根据orderItemId获取全部orderItem信息和order信息，若资源不存在返回空
	 * @author chenqw
	 * @param orderItemId
	 * @return
	 */
	public OrderSimple getOrderByOrderItemId(Long orderItemId);
}
