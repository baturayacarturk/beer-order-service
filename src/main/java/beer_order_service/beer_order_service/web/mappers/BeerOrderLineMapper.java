package beer_order_service.beer_order_service.web.mappers;

import beer_order_service.beer_order_service.domain.BeerOrderLine;
import beer_order_service.beer_order_service.web.model.BeerOrderLineDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerOrderLineMapper {
    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto);
}