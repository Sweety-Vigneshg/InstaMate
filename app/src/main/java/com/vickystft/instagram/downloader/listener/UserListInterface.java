package com.vickystft.instagram.downloader.listener;

import com.vickystft.instagram.downloader.api.model.NodeModel;
import com.vickystft.instagram.downloader.api.model.TrayModel;

public interface UserListInterface {
    void FacebookUserListClick(int i, NodeModel nodeModel);

    void FacebookUserListClick(int i, TrayModel trayModel);
}