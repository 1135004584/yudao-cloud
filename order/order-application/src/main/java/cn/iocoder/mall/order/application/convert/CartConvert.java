package cn.iocoder.mall.order.application.convert;

import cn.iocoder.mall.order.api.bo.CalcOrderPriceBO;
import cn.iocoder.mall.order.api.bo.CalcSkuPriceBO;
import cn.iocoder.mall.order.application.vo.UsersCalcSkuPriceVO;
import cn.iocoder.mall.order.application.vo.UsersCartDetailVO;
import cn.iocoder.mall.order.application.vo.UsersOrderConfirmCreateVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CartConvert {

    CartConvert INSTANCE = Mappers.getMapper(CartConvert.class);

    UsersOrderConfirmCreateVO convert(CalcOrderPriceBO calcOrderPriceBO);

    UsersCartDetailVO convert2(CalcOrderPriceBO calcOrderPriceBO);

    UsersCalcSkuPriceVO convert2(CalcSkuPriceBO calcSkuPriceBO);

}