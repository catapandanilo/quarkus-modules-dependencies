package org.acme.client.dto;

import org.acme.client.model.ClientEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "cdi")
public interface ClientMapper {

    static ClientMapper getInstance() {
        return Mappers.getMapper(ClientMapper.class);
    }

//    @Mapping(target = "name", source = "fantasyName")
//    @Mapping(target = "id", ignore = true)
//    @Mapping(target = "dateCreation", ignore = true)
//    @Mapping(target = "dateUpdate", ignore = true)
//    @Mapping(target = "localization.id", ignore = true)
//    public Client toClient(AddRestaurantDTO dto);

//    @Mapping(target = "name", source = "fantasyName")
//    public void toRestaurant(UpdateRestaurantDTO updateRestaurantDTO,
//        @MappingTarget Restaurant restaurant);


    ClientEntityDTO toDTO(ClientEntity source);

    ClientEntity toEntity(ClientEntityDTO source);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "fantasyName", source = "name")
    ClientEntity toEntity(ClientEntity source, @MappingTarget ClientEntity target);
}