package com.codeup;

import org.springframework.data.jpa.repository.JpaRepository;

interface AdRepository extends JpaRepository<Ad, Long> {

    Ad findByTitle(String title);

}
