package cn.edu.xmu.ooad.other.required;

import cn.edu.xmu.ooad.other.required.model.SkuSimple;
import cn.edu.xmu.ooad.other.required.model.SpuSimple;

public interface IGoodsService {
	/**根据skuid获取sku信息，若资源无效或不存在，返回空
	 * @author chenqw
	 * @param skuId
	 * @return SkuSimple or null
	 */
	public SkuSimple getSkuBySkuId(Long skuId);
	
	/**根据spuid获取全部sku，若资源无效或不存在，返回空
	 * 
	 * @param spuId
	 * @return
	 */
	public SpuSimple getSkusBySpuId(Long spuId);
}
