package com.lwj.alg.structure;

/**
 * Created by leewj on 2015/3/22.
 */
public class Record implements Comparable<Record>{
    public String userId;
    public String itemId;
    public double rate;
    public Long timestamp;

    public Record(String userId, String itemId, double rate, long timestamp) {
        this.userId = userId;
        this.itemId = itemId;
        this.rate = rate;
        this.timestamp = timestamp;
    }

    public Record(String userId,String itemId,String rate,String timestamp){
        this.userId = userId;
        this.itemId = itemId;
        this.rate = Double.parseDouble(rate);
        this.timestamp = Long.parseLong(timestamp);
    }


    @Override
    public int compareTo(Record o) {
        return this.timestamp.compareTo(o.timestamp);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
        result = prime * result + ((userId == null) ? 0 : userId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Record other = (Record) obj;
        if (itemId == null) {
            if (other.itemId != null)
                return false;
        } else if (!itemId.equals(other.itemId))
            return false;
        if (userId == null) {
            if (other.userId != null)
                return false;
        } else if (!userId.equals(other.userId))
            return false;
        return true;
    }
}
