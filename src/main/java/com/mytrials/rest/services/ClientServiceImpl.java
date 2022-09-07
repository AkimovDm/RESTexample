package com.mytrials.rest.services;

import com.mytrials.rest.model.ClientModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class ClientServiceImpl implements ClientService {

    

    private static final Map<Integer, ClientModel> CLIENT_REPOSITORY_MAP = new HashMap<>();
    private static final AtomicInteger CLIENT_ID_HOLDER = new AtomicInteger();


    @Override
    public void create(ClientModel clientModel) {
        final int clientId = CLIENT_ID_HOLDER.incrementAndGet();
        clientModel.setId(clientId);
        CLIENT_REPOSITORY_MAP.put(clientId, clientModel);

    }

    @Override
    public List<ClientModel> readAll() {

        return new ArrayList<>(CLIENT_REPOSITORY_MAP.values());
    }

    @Override
    public ClientModel read(int id) {

        return CLIENT_REPOSITORY_MAP.get(id);
    }

    @Override
    public boolean update(ClientModel clientModel, int id) {

        if (CLIENT_REPOSITORY_MAP.containsKey(id)) {
            clientModel.setId(id);
            CLIENT_REPOSITORY_MAP.put(id, clientModel);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(int id) {

        return CLIENT_REPOSITORY_MAP.remove(id) != null;
    }
}
