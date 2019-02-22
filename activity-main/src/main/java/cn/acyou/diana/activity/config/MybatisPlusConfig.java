package cn.acyou.diana.activity.config;

import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author youfang
 * @version [1.0.0, 2019-02-22 下午 02:19]
 **/
@EnableTransactionManagement
@Configuration
@MapperScan(basePackages = {"cn.acyou.diana.activity.mapper"})
public class MybatisPlusConfig {
    /**
     * SQL执行效率插件
     */
    @Bean
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }
}
