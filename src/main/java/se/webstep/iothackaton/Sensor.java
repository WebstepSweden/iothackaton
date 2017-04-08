package se.webstep.iothackaton;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.ZonedDateTime;
import java.util.Map;

/**
 * 2017-04-08, Created by Johannes.
 *
 *       {
 "id":"206847491",
 "name":"Konferensrummet",
 "description":"",
 "starred":true,
 "registered":"2017-01-21T00:01:44.105236504Z",
 "last_updated":"2017-04-06T10:57:25.055657154Z",
 "folder":{
 "id":"b38ghkq15hbg00eb1p3g",
 "parent_id":"",
 "level":0,
 "name":"Webstep Stockholm",
 "description":""
 },
 "state":{
 "id":"206847491",
 "updated":"2017-04-06T10:57:25.055657154Z",
 "properties":{
 "temperature":21,
 "object_present":false,
 "touch":false,
 "rssi":-87,
 "rssi_strength":2,
 "battery_voltage":2.92,
 "battery_percentage":100,
 "connector_id":"con-000"
 }
 },
 "type":{
 "id":"proximity",
 "name":"",
 "icon":"",
 "chart_type":"",
 "primary":""
 },
 "firmware":""
 }
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sensor {

    private String id;
    private String name;
    private String description;
    private boolean starred;
    private ZonedDateTime registered;
    @JsonProperty("last_updated")
    private ZonedDateTime lastUpdated;

    private Folder folder;
    private State state;
    private Type type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStarred() {
        return starred;
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }

    public ZonedDateTime getRegistered() {
        return registered;
    }

    public void setRegistered(ZonedDateTime registered) {
        this.registered = registered;
    }

    public ZonedDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(ZonedDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    /**
     *  "folder":{
     "id":"b38ghkq15hbg00eb1p3g",
     "parent_id":"",
     "level":0,
     "name":"Webstep Stockholm",
     "description":""
     }
     */
    private static class Folder {
        private String id;

        @JsonProperty("parent_id")
        private String parentId;
        private int level;
        private String name;
        private String description;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getParentId() {
            return parentId;
        }

        public void setParentId(String parentId) {
            this.parentId = parentId;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return "Folder{" +
                    "id='" + id + '\'' +
                    ", parentId='" + parentId + '\'' +
                    ", level=" + level +
                    ", name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        }
    }

    /**
     *  "state":{
     "id":"206847491",
     "updated":"2017-04-06T10:57:25.055657154Z",
     "properties":{
     "temperature":21,
     "object_present":false,
     "touch":false,
     "rssi":-87,
     "rssi_strength":2,
     "battery_voltage":2.92,
     "battery_percentage":100,
     "connector_id":"con-000"
     }
     */
    private static class State {
        private String id;
        private ZonedDateTime updated;
        private Map<String, Object> properties;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public ZonedDateTime getUpdated() {
            return updated;
        }

        public void setUpdated(ZonedDateTime updated) {
            this.updated = updated;
        }

        public Map<String, Object> getProperties() {
            return properties;
        }

        public void setProperties(Map<String, Object> properties) {
            this.properties = properties;
        }

        @Override
        public String toString() {
            return "State{" +
                    "id='" + id + '\'' +
                    ", updated=" + updated +
                    ", properties=" + properties +
                    '}';
        }
    }

    /**
     *  "type":{
     "id":"proximity",
     "name":"",
     "icon":"",
     "chart_type":"",
     "primary":""
     },
     */
    private static class Type {
        private String id;
        private String name;
        private String icon;
        @JsonProperty("chart_type")
        private String chartType;
        private String primary;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getChartType() {
            return chartType;
        }

        public void setChartType(String chartType) {
            this.chartType = chartType;
        }

        public String getPrimary() {
            return primary;
        }

        public void setPrimary(String primary) {
            this.primary = primary;
        }

        @Override
        public String toString() {
            return "Type{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", icon='" + icon + '\'' +
                    ", chartType='" + chartType + '\'' +
                    ", primary='" + primary + '\'' +
                    '}';
        }
    }
}
