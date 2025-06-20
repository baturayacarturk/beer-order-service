package beer_order_service.beer_order_service.web.mappers;


import beer_order_service.beer_order_service.domain.BeerOrder;
import beer_order_service.beer_order_service.web.model.BeerOrderDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class, BeerOrderLineMapper.class})
public interface BeerOrderMapper {

    BeerOrderDto beerOrderToDto(BeerOrder beerOrder);

    BeerOrder dtoToBeerOrder(BeerOrderDto dto);
}