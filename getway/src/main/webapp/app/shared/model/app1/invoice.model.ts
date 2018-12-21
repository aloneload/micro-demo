import { Moment } from 'moment';

export interface IInvoice {
  id?: number;
  code?: string;
  date?: Moment;
  details?: string;
  paymentDate?: Moment;
  paymentAmount?: number;
}

export const defaultValue: Readonly<IInvoice> = {};
