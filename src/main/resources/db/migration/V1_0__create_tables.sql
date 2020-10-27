CREATE TABLE `device` (
  `id` int(11) NOT NULL,
  `dev_id` varchar(255) NOT NULL,
  `app_id` varchar(255) NOT NULL,
  `hardware_serial` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `payload` (
  `id` int(11) NOT NULL,
  `device_id` int(11) NOT NULL,
  `battery` int(11) NOT NULL,
  `event` varchar(255) NOT NULL,
  `light` int(11) NOT NULL,
  `temperature` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

ALTER TABLE `device`
  ADD PRIMARY KEY (`id`);
ALTER TABLE `payload`
  ADD PRIMARY KEY (`id`);
ALTER TABLE `device`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
ALTER TABLE `payload`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
  
ALTER TABLE payload
ADD FOREIGN KEY (device_id) REFERENCES device(id);