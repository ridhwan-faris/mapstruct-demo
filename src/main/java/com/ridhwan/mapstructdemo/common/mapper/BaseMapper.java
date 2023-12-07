package com.ridhwan.mapstructdemo.common.mapper;


public interface BaseMapper<Source, Target> {
    Target toTarget(Source source);
    Source fromTarget(Target target);
}
