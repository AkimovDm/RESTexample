package com.mytrials.rest.services;

import com.mytrials.rest.model.ClientModel;

import java.util.List;

public interface ClientService {
    /**
     * Создает нового клиента
     * @param clientModel - клиент для создания
     */
    void create(ClientModel clientModel);

    /**
     * Возвращает список всех имеющихся клиентов
     * @return список клиентов
     */
    List<ClientModel> readAll();

    /**
     * Возвращает клиента по его ID
     * @param id - ID клиента
     * @return - объект клиента с заданным ID
     */
    ClientModel read(int id);

    /**
     * Обновляет клиента с заданным ID,
     * в соответствии с переданным клиентом
     * @param clientModel - клиент в соответсвии с которым нужно обновить данные
     * @param id - id клиента которого нужно обновить
     * @return - true если данные были обновлены, иначе false
     */
    boolean update(ClientModel clientModel, int id);

    /**
     * Удаляет клиента с заданным ID
     * @param id - id клиента, которого нужно удалить
     * @return - true если клиент был удален, иначе false
     */
    boolean delete(int id);

}
