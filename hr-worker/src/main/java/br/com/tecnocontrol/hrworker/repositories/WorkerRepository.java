package br.com.tecnocontrol.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tecnocontrol.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
