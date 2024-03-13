package org.github;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest
{

    @Test
    void initTest() {
        assertThat(new App().returnTrue()).isTrue();
    }
}
