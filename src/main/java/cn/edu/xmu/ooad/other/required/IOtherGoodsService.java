package cn.edu.xmu.ooad.other.required;

import cn.edu.xmu.ooad.other.required.model.OtherSkuComplex;
import cn.edu.xmu.ooad.other.required.model.OtherSkuSimple;
import cn.edu.xmu.ooad.other.required.model.OtherSpuSimple;

public interface IOtherGoodsService {
	/**根据skuid获取简单的sku信息，若资源无效或不存在，返回空
	 * @author chenqw
	 * @param skuId
	 * @return SkuSimple or null
	 */
	public OtherSkuSimple getSkuBySkuId(Long skuId);
	
	/**根据skuid获取包括spu信息在内的sku信息，若资源无效或不存在，返回空
	 * @author chenqw
	 * @param skuId
	 * @return SkuSimple or null
	 */
	public OtherSkuComplex getSkuWithSpuInfoBySkuId(Long skuId);
	
	/**根据spuid获取全部sku，若资源无效或不存在，返回空
	 * 
	 * @param spuId
	 * @return
	 */
	public OtherSpuSimple getSkusBySpuId(Long spuId);
}
