package com.company.model.dao;

import com.company.model.dao.impl.JDBCDaoFactory;

public abstract class DaoFactory {
    private static DaoFactory daoFactory;

    public abstract NoteBookDao createNoteBookDao();

    public static DaoFactory getInstance(){
       if( daoFactory == null ){
           synchronized (DaoFactory.class){
               if(daoFactory==null){
                   DaoFactory temp = new JDBCDaoFactory();
                   daoFactory = temp;
               }
           }
       }   return daoFactory;

    }
}
