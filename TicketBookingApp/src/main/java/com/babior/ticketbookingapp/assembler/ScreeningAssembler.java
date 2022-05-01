package com.babior.ticketbookingapp.assembler;

import com.babior.ticketbookingapp.business.Screening;
import com.babior.ticketbookingapp.controller.MovieController;
import com.babior.ticketbookingapp.controller.ScreeningController;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class ScreeningAssembler implements RepresentationModelAssembler<Screening, EntityModel<Screening>> {
    @Override
    public EntityModel<Screening> toModel(Screening screening) {
        return EntityModel.of(screening,
                linkTo(methodOn(ScreeningController.class).findMScreeningById(screening.getId())).withSelfRel(),
                linkTo(methodOn(ScreeningController.class).findAllScreenings()).withRel("screening"));
    }
}