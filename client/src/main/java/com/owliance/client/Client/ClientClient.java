package com.owliance.client.Client;

import com.owliance.client.Models.Client;
import com.owliance.client.Models.Portal;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "client-service", url = "${application.config.client-url}")
public interface ClientClient {

    @GetMapping("/school/{id}")
    List<Portal> findAllPortalsByClientId(@PathVariable("id") Integer id);

}
