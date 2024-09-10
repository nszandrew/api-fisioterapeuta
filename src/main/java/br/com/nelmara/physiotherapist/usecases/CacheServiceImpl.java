package br.com.nelmara.physiotherapist.usecases;

import br.com.nelmara.physiotherapist.adapters.service.CacheService;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CacheServiceImpl implements CacheService {

    private final CacheManager cacheManager;

    public CacheServiceImpl(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    @Override
    public void evictAllCacheValues(String name) {
        Objects.requireNonNull(cacheManager.getCache(name)).clear();
    }
}
