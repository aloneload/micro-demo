package app1.web.rest;

import app1.client.AuthorizedFeignClient;
import app1.security.AuthoritiesConstants;
import app1.security.SecurityUtils;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FooApp1 {
    @GetMapping("/foo-app1")
    public String Foo() {
        return SecurityUtils.getCurrentUserLogin().orElse("null");
    }
}
