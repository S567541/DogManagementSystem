package com.bushaClasses.DMS.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bushaClasses.DMS.Models.Trainer;
/*
* @Author Pavan Kalyan Busha
*/
@Repository
public interface TrainerRepository extends CrudRepository<Trainer, Integer> {

}